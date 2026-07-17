+++
title = "Siri AI and DMA"
date = "2026-07-17"
tags = ["ai", "security", "permissions"]
author = "Sankara"
+++

Treating "let Siri use a different model" as a configuration toggle skips the hard part. Permission mediation has to live in the operating system to exist at all.

Take file access in a sandboxed browser. Websites have legitimate reasons to read files, and the correct design is a system file picker that any browser can invoke. The user grants scoped access deliberately, once, and never gets worn down into handing over the whole disk. Safari building its own version would defeat the purpose. That paradigm took years to arrive at.

Photos shows what happens when it doesn't arrive. A decade on, we have a picker, a limited-library grant, a separate add-to-library grant, and plenty of apps that still refuse to function without access to the entire library. That's the state of the art for reading a photo album.

An agent wired into App Intents is a categorically larger problem. It reads your data and then executes on your behalf across every app you own. There's no prior art for that. Whatever ships first will be wrong in one of the known ways: permission fatigue, granularity too coarse to be safe, or controls so fine-grained the thing becomes unusable. The question worth arguing about is who owns the job of iterating toward less wrong.

That job belongs to Apple, at the OS layer, in the manner of MDM. MDM works because the system imposes the policy. A vendor promise that you'd have to audit yourself would be worthless, and I have no interest in validating model behavior. So I won't switch to a third-party model unless the guarantee is baked in beneath the model. And if Apple permits the switch without it, I'd trust Apple somewhat less as well.
