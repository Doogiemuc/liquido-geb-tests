package org.liquido.geb

import geb.Page

/**
 * Page for registering a new user
 */
class RegisterPage extends Page {

    static url = "/#/register"

    static at = { $("#RegisterPage").size() == 1 }

    static content = {
        form { module RegisterFormModule }
    }
}