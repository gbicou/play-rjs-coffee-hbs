require.config
  paths:
    jquery:     '../lib/jquery/jquery' # webjar
    'handlebars.runtime': '../lib/handlebars/handlebars.runtime' # hbs runtime
    templates:  '../templates'         # hbs templates

require ["jquery", "templates/demo", "templates/sub/_part", "templates_helpers"], ($, template) ->

  $ ->
    $.get '/demo', (result) ->
      $('#demo').html(template(result))

