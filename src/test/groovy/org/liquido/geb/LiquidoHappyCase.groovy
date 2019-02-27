package org.liquido.geb

import geb.spock.GebSpec

class LiquidoHappyCase extends GebSpec {

    def "can go to Liquido HomePage"() {
        when:
        to LiquidoHomePage

        then:
        at LiquidoHomePage
    }

    def "can register"() {
        when:
        to RegisterPage

        and:
        //int num = System.currentTimeMillis() % 100
        //form.emailInput.text = "groovyTest"+num+"@liquido.org"

        form.fullnameInput.text = "Donald Duck"
        //form.mobilephoneInput.text = "+49 1234599"+num
        form.websiteInput.text = "www.geb.test"
        form.avatarImgs[3].click()

        then:
        form.registerButton.@disabled == 'false'
    }
}