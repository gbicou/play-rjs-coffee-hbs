require.config
  paths:
    jquery:     '../lib/jquery/jquery' # webjar
    templates:  '../templates'         # hbs templates

require ["jquery", "templates/demo"], ($, template) ->

  $ ->
    $.get '/demo', (result) ->
      $('#demo').html(template(result))

