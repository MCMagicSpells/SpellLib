package me.thecomputergeek2.magicspells.msvalidator

import spock.lang.Specification
import org.gradle.api.Plugin
import org.gradle.testfixtures.ProjectBuilder

// Nullify the test for now
class MSValidatorPluginTest extends Specification {
    def "construction test"() {
        setup:
        println 'setup'

        when:
        def pl = new MSValidatorPlugin()
        if (!(pl instanceof Plugin)) throw new IllegalStateException()
        if (pl == null) throw new NullPointerException()

        then:
        noExceptionThrown()
    }

}
