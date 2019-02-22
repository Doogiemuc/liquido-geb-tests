package org.liquido.geb

import geb.Page

/**
 * Geb Page object for the Liquido HomePage
 */
class LiquidoHomePage extends Page {

    //static atCheckWaiting = true

    static at = { $("#LiquidoHomePage").size() == 1 }

    /*
    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
    */
}