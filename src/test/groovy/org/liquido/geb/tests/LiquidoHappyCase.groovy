package org.liquido.geb.tests

import geb.spock.GebSpec
import org.junit.Rule
import org.junit.rules.TestName
import org.liquido.geb.pages.LiquidoHomePage
import org.liquido.geb.pages.LoginPage
import org.liquido.geb.pages.RegisterPage
import org.liquido.geb.pages.UserHomePage
import spock.lang.Shared

class LiquidoHappyCase extends GebSpec {

    @Shared
    int num = System.currentTimeMillis() % 10000
    @Shared
    String testerEMail = "groovyTest"+num+"@liquido.org"
    @Shared
    String testerName = "Donald Duck"
    @Shared
    String testerMobilePhone = "+49 1234599"+num  // phone number has a space. Will be stored without spaces in DB.

    @Rule TestName testName = new TestName()

    //def setupSpec() {}

    def setup() {
        println "TestName: "+testName.methodName
    }

    def "go to Liquido HomePage"() {
        when:
        to LiquidoHomePage

        then:
        at LiquidoHomePage
    }

    def "register new userg"() {
        println "Registering as "+testerMobilePhone+"   "+testerEMail

        given:
        to RegisterPage

        when:
        form.emailInput.text = testerEMail
        form.fullnameInput.text = testerName
        form.mobilephoneInput.text = testerMobilePhone
        form.websiteInput.text = "www.geb.test"
        form.avatarImgs[3].click()

        then:
        //Hint: here the page object is available
        form.registerButton.@disabled == ''

        when:
        form.registerButton.click()

        then:
        waitFor { registerSuccess.present }
    }

    def "login via SMS "() {
        println "Trying to login via SMS as "+testerMobilePhone+"   "+testerEMail
        given:
        to LoginPage

        when:
        phoneInput = testerMobilePhone

        then:
        sendSmsLoginCodeButton.@disabled == ''

        when:
        sendSmsLoginCodeButton.click()
        waitFor { digit0.present }
        //Thread.sleep(1000)
        digit0 = 9
        digit1 = 9
        digit2 = 8
        digit3 = 8
        digit4 = 7
        digit5 = 7
        //Thread.sleep(5000)

        then:
        at UserHomePage
    }
}