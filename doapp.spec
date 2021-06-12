domains:
  - domain: sankara.me
    type: PRIMARY
name: me-sankara
region: nyc
static_sites:
  - environment_slug: html
    github:
      branch: trunk
      deploy_on_push: true
      repo: sankara/me.sankara
    name: me-sankara
    routes:
      - path: /
    source_dir: /public