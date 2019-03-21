package org.liquido.geb.pages

import geb.Page

class UserHomePage extends Page {
    static url = "/#/userHome"

    static at = { $("#UserHomePage").size() == 1 }

    static content = {
        pollInVotingLinks { $("div.pollPanel a.btn-default", href: ~/#\\/polls\\\d+/) }
        searchButton { $("#SearchButton")}
    }

}
