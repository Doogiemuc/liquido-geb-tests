package org.liquido.geb.pages

import geb.Page

/**
 * Geb Page object for the Liquido HomePage
 */
class LiquidoHomePage extends Page {

    //static atCheckWaiting = true

    static url = "/"

    static at = { $("#LiquidoHome").size() == 1 }

    static content = {
        registerButton { $("#RegisterButton") }
        devLoginButton { $("#DevLoginButton")}
        devLoginUsers  { $("#DevLoginButton + ul > li") }
    }

    void login() {
        devLoginButton.click()
        devLoginUsers[0].click()
    }

}