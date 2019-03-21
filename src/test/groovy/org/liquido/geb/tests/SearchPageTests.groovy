package org.liquido.geb.tests

import geb.spock.GebSpec
import org.junit.Rule
import org.junit.rules.TestName
import org.liquido.geb.pages.LiquidoHomePage
import org.liquido.geb.pages.LoginPage
import org.liquido.geb.pages.RegisterPage
import org.liquido.geb.pages.SearchPage
import org.liquido.geb.pages.UserHomePage
import spock.lang.Shared

class SearchPageTests extends GebSpec {

    @Rule TestName testName = new TestName()

    //def setupSpec() {}

    def setup() {
        println "===== "+testName.methodName+" ====="
    }

    def "Search for an idea"() {
        given:
        to LiquidoHomePage

        when:
        login()

        then:
        at UserHomePage

        when:
        searchButton.click()

        then:
        at SearchPage

    }
}