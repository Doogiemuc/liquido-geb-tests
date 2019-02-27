/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
    timeout = 5
}

environments {
    atCheckWaiting = true

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {

        driver = {
            ChromeOptions co = new ChromeOptions()
            co.setBinary("C:\\Program Files (x86)\\SRWare Iron\\chrome.exe")   // I use SRWare Iron - secure version of chrome
            co.addArguments("" +
                "--window-size=1024,768",
                "--disable-extensions"
            )
            co.setExperimentalOption("useAutomationExtension", false)
            new ChromeDriver(co)
        }
    }

    // run via “./gradlew chromeHeadlessTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        atCheckWaiting = 2

        driver = { new FirefoxDriver() }
    }

}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://localhost:3001"