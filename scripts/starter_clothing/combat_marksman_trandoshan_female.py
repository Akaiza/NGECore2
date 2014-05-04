import sys

def CombatMarksmanTrandoshanFemale(core, object):
	shirt = core.objectService.createObject('object/tangible/wearables/shirt/shared_shirt_s28.iff', object.getPlanet())
	bandolier = core.objectService.createObject('object/tangible/wearables/bandolier/shared_npe_bandolier.iff', object.getPlanet())
	necklace = core.objectService.createObject('object/tangible/wearables/necklace/shared_necklace_primitive_04.iff', object.getPlanet())
	pants = core.objectService.createObject('object/tangible/wearables/pants/shared_pants_s09.iff', object.getPlanet())
	belt = core.objectService.createObject('object/tangible/wearables/belt/shared_npe_belt_02.iff', object.getPlanet())
	inventory = object.getSlottedObject('inventory')
	object._add(shirt)
	object._add(bandolier)
	object._add(necklace)
	object._add(pants)
	object._add(belt)