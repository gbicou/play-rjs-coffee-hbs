require.config
  paths:
    templates: "../templates"

require ["templates/demo"], (template) ->

  document.getElementById('demo').innerHTML = template {name: 'sbt-hbs', version: '0.0.1'}

