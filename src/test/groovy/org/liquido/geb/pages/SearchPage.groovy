package org.liquido.geb.pages

import geb.Page

class SearchPage extends Page {

    static url = "/#/search"

    static at = { $("#SearchPage").size() == 1 }

    /*
    static content = {
        lawTable { $("#SearchTable") }
    }
    */
}
