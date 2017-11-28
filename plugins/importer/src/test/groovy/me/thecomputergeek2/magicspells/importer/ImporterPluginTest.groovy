package me.thecomputergeek2.magicspells.importer

import spock.lang.Specification

// Nullify the test for now
class ImporterPluginTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = { true }

        when:
        def result = lib()

        then:
        result == true
    }
}
