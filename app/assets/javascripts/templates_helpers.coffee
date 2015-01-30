define ['handlebars.runtime'], (hbr) ->

  hbr.registerHelper 'strong', (options) ->
    new hbr.SafeString '<strong>' + options.fn(this) + '</strong>'

