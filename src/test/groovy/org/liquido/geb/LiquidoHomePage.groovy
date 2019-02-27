package org.liquido.geb

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
    }

}