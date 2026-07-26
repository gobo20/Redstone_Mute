{
  "schemaVersion": 1,
  "id": "redstonesoundmute-client",
  "version": "${version}",
  "name": "RedstoneSoundMute Client",
  "description": "Mutes dropper, dispenser, repeater, observer sounds client-side. Pistons, chests, barrels stay loud.",
  "authors": ["gobo20"],
  "contact": {},
  "license": "MIT",
  "environment": "client",
  "entrypoints": {
    "client": ["de.kanst.soundmute.RedstoneSoundMuteClient"]
  },
  "mixins": ["redstonesoundmute.mixins.json"],
  "depends": {
    "fabricloader": ">=0.16.0",
    "minecraft": "~1.21.1",
    "java": ">=21"
  }
}
