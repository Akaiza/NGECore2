import sys

def setup(core, object):
	object.setAttachment('radial_filename', 'deeds/vehicleDeed')
	return

def use(core, actor, object):
	core.mountService.generateVehicle(actor, object, 'object/mobile/vehicle/shared_speederbike_flash.iff', 'object/intangible/vehicle/shared_speederbike_flash_pcd.iff')
	return
	