import sys

def CombatBrawlerWookieeMale(core, object):
	shirt = core.objectService.createObject('object/tangible/wearables/wookiee/shared_wke_shirt_s04.iff', object.getPlanet())
	skirt = core.objectService.createObject('object/tangible/wearables/wookiee/shared_wke_skirt_s02.iff', object.getPlanet())
	inventory = object.getSlottedObject('inventory')
	object._add(shirt)
	object._add(skirt)
