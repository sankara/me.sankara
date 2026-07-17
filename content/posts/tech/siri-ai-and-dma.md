+++
title = "Siri AI and DMA"
date = "2026-07-17"
tags = ["ai", "security", "permissions"]
author = "Sankara"
+++

Treating "let Siri use a different model" as a configuration toggle skips the hard part. **Permission mediation has to live in the operating system, or it doesn't meaningfully exist.**

Take file access in a sandboxed browser. Websites have legitimate reasons to read files, and the correct design isn't Safari building its own answer. It's a system file picker that any browser can invoke, so the user grants scoped access deliberately, once, without being worn down into handing over everything. That paradigm took years to arrive at.

Photos shows what happens when it doesn't arrive. A decade on, we have a picker, a limited-library grant, a separate add-to-library grant, and plenty of apps that still refuse to function without access to the whole library. That's the state of the art for reading a photo album.

An agent wired into App Intents is a *categorically larger problem*, because it doesn't stop at reading your data. It executes on your behalf across every app you own. There's no prior art for that. Whatever ships first will be wrong in one of the known ways: permission fatigue, granularity too coarse to be safe, or controls so fine-grained the thing becomes unusable. The question worth arguing about is who owns the job of iterating toward less wrong.

That job belongs to Apple, at the OS layer, in the manner of MDM. MDM works because enforcement is structural rather than contractual. The policy is imposed by the system; it isn't promised by a vendor and audited by you. I have neither the time nor the inclination to validate model behavior myself, so I won't switch to a third-party model unless that guarantee is baked in beneath the model. And if Apple permits the switch without it, I'd trust Apple somewhat less as well.
