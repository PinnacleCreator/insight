package org.pinnacle.creator.insight

import org.scalatest.FunSuite

/**
 * User: Michael
 * Date: 7/6/13
 * Time: 8:37 PM
 */
class ArchitributesTest extends FunSuite{

  test("Architributes anti attributes behave as expected"){

    val attr = new Architributes
    assert(attr.vals(Const.Alive) == Const.Meh)
    attr.setLiving(Const.Yes)
    assert(attr.livingState() == Const.Yes)
    attr.setLiving(3)
    assert(attr.livingState() == Const.Meh)
    attr.setMoving( Const.Yes)
    assert(attr.movingState() ==  Const.Yes)
    attr.setBig( Const.Yes)
    assert(attr.bigState() ==  Const.Yes)
    attr.setNear( Const.Yes)
    assert(attr.nearState() ==  Const.Yes)
    attr.setApproach( Const.Yes)
    assert(attr.approachState() ==  Const.Yes)
    attr.setStrong( Const.Yes)
    assert(attr.strongState() ==  Const.Yes)
    attr.setLoud( Const.Yes)
    assert(attr.loudState() ==  Const.Yes)
    attr.setStare( Const.Yes)
    assert(attr.stareState() ==  Const.Yes)
    attr.setMany( Const.Yes)
    assert(attr.manyState() ==  Const.Yes)
    attr.setMany( Const.Meh)
    assert(attr.manyState() ==  Const.Meh)
    attr.setMany( Const.No)
    assert(attr.manyState() ==  Const.No)
  }

  test ("Architributes pro attributes behave as expected"){
    val attr = new Architributes
    attr.setEdible( Const.Yes)
    assert(attr.edibleState() ==  Const.Yes)
    attr.setPotable( Const.No)
    assert(attr.potableState() ==  Const.No)
    attr.setUseful( Const.Yes)
    assert(attr.usefulState() ==  Const.Yes)
  }

  test("anti-self architribute constructor"){
    // alive: Int, moving: Int, big: Int, near: Int, approach: Int, strong: Int, loud: Int, stare: Int, many: Int
    val architributes = new Architributes( Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Meh)
    assert(architributes != null)
    assert(architributes.bigState() ==  Const.Yes)
    assert(architributes.manyState() ==  Const.Meh)
    assert(architributes.potableState() ==  Const.Meh)
  }
  test("pro-self architribute constructor"){
    val architributes = new Architributes( Const.Yes, Const.Yes, Const.Meh)
    assert(architributes != null)
    assert(architributes.usefulState() ==  Const.Meh)
    assert(architributes.edibleState() ==  Const.Yes)
  }

  test("SensoryInput object"){
    val threat = new Architributes( Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Yes, Const.Meh)
    val sensoryInput = new SensoryInput(threat)
    assert(sensoryInput != null)
    assert(sensoryInput.architributes != null)
    assert(sensoryInput.architributes.livingState() ==  Const.Yes)
  }
}
