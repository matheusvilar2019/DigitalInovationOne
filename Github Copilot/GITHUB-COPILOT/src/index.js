function luhnAlgorithm(cardNumber) {
    const digits = cardNumber.split('').map(Number);
    const oddDigits = digits.filter((_, idx) => (digits.length - idx) % 2 === 1);
    const evenDigits = digits.filter((_, idx) => (digits.length - idx) % 2 === 0);

    const checksum = oddDigits.reduce((sum, digit) => sum + digit, 0) +
    evenDigits.reduce((sum, digit) => {
        const doubled = digit * 2;
        return sum + (doubled > 9 ? doubled - 9 : doubled);
    }, 0);

    return checksum % 10 === 0;
}

function getCardIssuer(cardNumber) {
    const cardPatterns = {
        Visa: /^4[0-9]{12}(?:[0-9]{3})?$/,
        MasterCard: /^5[1-5][0-9]{14}$/,
        "American Express": /^3[47][0-9]{13}$/,
        Discover: /^6(?:011|5[0-9]{2})[0-9]{12}$/,
        JCB: /^(?:2131|1800|35\d{3})\d{11}$/,
        "Diners Club": /^3(?:0[0-5]|[68][0-9])[0-9]{11}$/
    }

    for (const [issuer, pattern] of Object.entries(cardPatterns)) {
        if (pattern.test(cardNumber)) {
            return issuer;
        }
    }
    return "Unknown";
}

function validateCreditCard(cardNumber) {
    if (luhnAlgorithm(cardNumber)) {
        const bandeira = getCardIssuer(cardNumber);
        return { valid: true, bandeira: bandeira };
    } else {
        return { valid: false, bandeira: null };
    }
}

// Example usage
const cardNumber = "38125396161243"; // Replace with the card number
const result = validateCreditCard(cardNumber);
console.log(result);