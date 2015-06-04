$ ->
  $.get "/users", (data) ->
    $.each data, (index, item) ->
      $("#users").append "<li>User " + item.name + "</li>"