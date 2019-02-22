package org.liquido.geb

import geb.spock.GebSpec

class LiquidoHappyCase extends GebSpec {

    def "can go to Liquido HomePage"() {
        when:
        to LiquidoHomePage

        /*
        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()
        */
        then:
        at LiquidoHomePage
    }
}