package org.liquido.geb.pages

import geb.Page

class LoginPage extends Page {

    static url = "/#/login"

    static at = { $("#LoginPage").size() == 1 }

    static content = {
        phoneInput { $("#phoneInput") }
        sendSmsLoginCodeButton { $("#sendSmsLoginCodeButton") }
        digit0(required: false) { $("#digit0") }
        digit1(required: false) { $("#digit1") }
        digit2(required: false) { $("#digit2") }
        digit3(required: false) { $("#digit3") }
        digit4(required: false) { $("#digit4") }
        digit5(required: false) { $("#digit5") }
    }
}
