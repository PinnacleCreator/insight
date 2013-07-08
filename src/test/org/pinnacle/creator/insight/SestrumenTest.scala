package org.pinnacle.creator.insight

import org.scalatest.FunSuite

/**
 * User: Michael
 * Date: 7/7/13
 * Time: 7:12 PM
 */
class SestrumenTest extends FunSuite {

  test("sestrumen has input and architributes"){
    val threat = new Architributes(Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Meh)
    val input = new SensoryInput(threat)
    val sestrumen = new Sestrumen(input)
    assert(sestrumen != null)
    assert(sestrumen.input.architributes != null)
    assert(sestrumen.input.architributes.bigState() == Const.Yes)
  }

}
