package org.liquido.geb

import geb.Module
import geb.module.TextInput

class RegisterFormModule extends Module {
    static content = {
        emailInput { $(id: "emailInput").module(TextInput) }
        fullnameInput { $(id: "fullnameInput").module(TextInput) }
        mobilephoneInput { $(id: "mobilephoneInput").module(TextInput) }
        avatarImgs { $("img.chooseAvatar ") }
        websiteInput { $(id: "websiteInput").module(TextInput) }

        registerButton { $("#RegisterButton") }
    }
}