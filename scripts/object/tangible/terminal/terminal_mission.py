import sys

def setup(core, object):
	core.mapService.addLocation(object.getPlanet(), 'Mission Terminal', object.getPosition().x, object.getPosition().z, 41, 44, 0)
	object.setAttachment("terminalType", 1)
	return
	