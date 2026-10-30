package com.example.lab_8

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class TrainTest {

    private lateinit var evilWizard: Wizard

    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 0, 10)
    }

    @Test
    fun trainSuccessful() {
        evilWizard.restoreMana(30) // Lots of mana
        evilWizard.train()
        assertEquals(25, evilWizard.mana)
        assertEquals(11, evilWizard.spellPower)
    }

    @Test
    fun trainUnsuccessful() {
        evilWizard.restoreMana(2) // Lots of mana
        evilWizard.train()
        assertEquals(2, evilWizard.mana)
        assertEquals(10, evilWizard.spellPower)
    }
}