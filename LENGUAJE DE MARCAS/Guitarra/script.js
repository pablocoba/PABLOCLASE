var $tab = document.querySelector(".tab");
function addRow(template, replace = false) {
  var template =
    template ||
    `
e|-------5-7-----7-|-8-----8-2-----2-|-0---------0-----|-----------------|
B|-----5-----5-----|---5-------3-----|---1---1-----1---|-0-1-1-----------|
G|---5---------5---|-----5-------2---|-----2---------2-|-0-2-2-----------|
D|-7-------6-------|-5-------4-------|-3---------------|-----------------|
A|-----------------|-----------------|-----------------|-2-0-0---0--/8-7-|
E|-----------------|-----------------|-----------------|-----------------|
  `;
  var html = template
    .split("")
    .map((e) => {
      if (e === "-" || e.match(/[0-9+]/))
        return `<span class='is-editable'>${e}</span>`;
      return `<span>${e}</span>`;
    })
    .join("");
  replace ? ($tab.innerHTML = html) : ($tab.innerHTML += html);
  var spans = document.querySelectorAll("span");
  var isMoving = false;
  var $dragging;
  Array.prototype.forEach.call(spans, (span) => {
    span.addEventListener("mousedown", (e) => {
      e.preventDefault();
      isMoving = true;
      $dragging = e.target;
    });
    span.addEventListener("mouseup", (e) => {
      isMoving = false;
    });
    span.addEventListener("click", (e) => {
      if (!e.target.classList.contains("is-editable")) return;
      var html = e.target.innerHTML;
      e.target.innerHTML = "<input>";
      var input = e.target.querySelector("input");
      if (html != "-") input.value = html;
      input.focus();
      input.addEventListener("blur", (b) => {
        var value = b.target.value != "" ? b.target.value : "-";
        e.target.innerHTML = `${value}`;
      });
    });
  });
  document.body.addEventListener("mousemove", (e) => {
    if (isMoving && e.target.classList.contains("is-editable")) {
      var old = $dragging.innerHTML;
      var neww = e.target.innerHTML;
      $dragging.innerHTML = neww;
      e.target.innerHTML = old;
      $dragging = e.target;
    }
  });
}
var template = `
e|-----------------------------------------------------------------------|
B|-----------------------------------------------------------------------|
G|-----------------------------------------------------------------------|
D|-----------------------------------------------------------------------|
A|-----------------------------------------------------------------------|
E|-----------------------------------------------------------------------|
  `;
addRow();
document.querySelector(".clear").addEventListener("click", clear);
document
  .querySelector(".add-row")
  .addEventListener("click", (e) => addRow(template));
document
  .querySelector(".download")
  .addEventListener("click", (e) => download());
function clear() {
  addRow(template, true);
}
function download() {
  var element = document.createElement("a");
  element.setAttribute(
    "href",
    "data:text/plain;charset=utf-8," + encodeURIComponent($tab.innerText)
  );
  element.setAttribute("download", "tab.txt");
  element.style.display = "none";
  document.body.appendChild(element);
  element.click();
  document.body.removeChild(element);
}