package it.unibo.ise.lab.resolution

import it.unibo.tuprolog.core.Atom
import it.unibo.tuprolog.core.Struct

val peanoNumbers: Sequence<Struct>
    get() = generateSequence<Struct>(Atom.of("z")) { Struct.of("s", it) }
