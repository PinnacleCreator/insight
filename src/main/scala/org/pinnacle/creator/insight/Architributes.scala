package org.pinnacle.creator.insight

/**
 * User: Michael
 * Date: 7/6/13
 * Time: 8:09 PM
 */
class Architributes {

  var vals = Array(Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh, Const.Meh)

  // the anti-self constructor
  def this(alive: Int, moving: Int, big: Int, near: Int, approach: Int, strong: Int, loud: Int, stare: Int, many: Int){
    this()
    vals(Const.Alive) = alive
    vals(Const.Moving) = moving
    vals(Const.Big) = big
    vals(Const.Near) = near
    vals(Const.Approach) = approach
    vals(Const.Strong) = strong
    vals(Const.Loud) = loud
    vals(Const.Stare) = stare
    vals(Const.Many) = many
  }

  def this(edible: Int, potable: Int, useful: Int){
    this()
    vals(Const.Edible) = edible
    vals(Const.Potable) = potable
    vals(Const.Useful) = useful
  }

  def setLiving (living: Int) = {
    if (living >= Const.No && living <= Const.Yes)
      vals(Const.Alive) = living
    else
      vals(Const.Alive) = Const.Meh
  }
  def setMoving (moving: Int) = {if (moving >= Const.No && moving <= Const.Yes) vals(Const.Moving) = moving else vals(Const.Moving) = Const.Meh}
  def setBig    (big: Int) = {if (big >= Const.No && big <= Const.Yes) vals(Const.Big) = big else vals(Const.Big) = Const.Meh}
  def setNear   (near: Int) = {if (near >= Const.No && near <= Const.Yes) vals(Const.Near) =  near else vals(Const.Near) = Const.Meh}
  def setApproach (approach: Int) = {if (approach >= Const.No && approach <= Const.Yes) vals(Const.Approach) = approach else vals(Const.Approach) = Const.Meh}
  def setStrong (strong: Int) = {if (strong >= Const.No && strong <= Const.Yes) vals(Const.Strong) = strong else vals(Const.Strong) = Const.Meh}
  def setLoud   (loud: Int) = {if (loud >= Const.No && loud <= Const.Yes) vals(Const.Loud) = loud else vals(Const.Loud) = Const.Meh}
  def setStare  (stare: Int) = {if (stare >= Const.No && stare <= Const.Yes) vals(Const.Stare) = stare else vals(Const.Stare) = Const.Meh}
  def setMany   (many: Int) = {if (many >= Const.No && many <= Const.Yes) vals(Const.Many) = many else vals(Const.Many) = Const.Meh}

  def setEdible (edible: Int) = {if (edible >= Const.No && edible <= Const.Yes) vals(Const.Edible) = edible else vals(Const.Edible) = Const.Meh}
  def setPotable   (potable: Int) = {if (potable >= Const.No && potable <= Const.Yes) vals(Const.Potable) = potable else vals(Const.Potable) = Const.Meh}
  def setUseful   (useful: Int) = {if (useful >= Const.No && useful <= Const.Yes) vals(Const.Useful) = useful else vals(Const.Useful) = Const.Meh}

  def livingState ()  :Int =  {vals(Const.Alive)}
  def movingState () :Int = {vals(Const.Moving)}
  def bigState () :Int = {vals(Const.Big)}
  def nearState ()  :Int =  {vals(Const.Near)}
  def approachState ()  :Int =  {vals(Const.Approach)}
  def strongState ()  :Int =  {vals(Const.Strong)}
  def loudState ()  :Int =  {vals(Const.Loud)}
  def stareState ()  :Int =  {vals(Const.Stare)}
  def manyState ()  :Int =  {vals(Const.Many)}

  def edibleState ()  :Int =  {vals(Const.Edible)}
  def potableState ()  :Int =  {vals(Const.Potable)}
  def usefulState ()  :Int =  {vals(Const.Useful)}

}
