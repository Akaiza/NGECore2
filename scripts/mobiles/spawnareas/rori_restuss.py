# Spawn Area file created with PSWG Planetary Spawn Tool
import sys
from java.util import Vector

def addSpawnArea(core):
	dynamicGroups = Vector()
	dynamicGroups.add('imperial')
	dynamicGroups.add('rebel')
	core.spawnService.addDynamicSpawnArea(dynamicGroups, 5378, 5674, 400, 'rori')
	return
