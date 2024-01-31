let displayValue = '0';
let operator = '';
let firstOperand = null;

function updateDisplay() {
    document.getElementById('display').innerText = displayValue;
}

function clearDisplay() {
    displayValue = '0';
    operator = '';
    firstOperand = null;
    updateDisplay();
}

function appendNumber(number) {
    if (displayValue === '0' || operator === '=') {
        displayValue = number;
    } else {
        displayValue += number;
    }
    updateDisplay();
}

function addDecimal() {
    if (!displayValue.includes('.')) {
        displayValue += '.';
        updateDisplay();
    }
}

function setOperator(op) {
    if (operator !== '' && firstOperand !== null) {
        calculate();
    }
    operator = op;
    if (displayValue !== '0') {
        firstOperand = parseFloat(displayValue);
    }
    displayValue = '0';
}

function calculate() {
    const secondOperand = parseFloat(displayValue);
    let result = 0;
    switch (operator) {
        case '+':
            result = firstOperand + secondOperand;
            break;
        case '-':
            result = firstOperand - secondOperand;
            break;
        case '*':
            result = firstOperand * secondOperand;
            break;
        case '/':
            result = firstOperand / secondOperand;
            break;
    }
    displayValue = result.toString();
    operator = '=';
    updateDisplay();
}

// Initial display update
updateDisplay();