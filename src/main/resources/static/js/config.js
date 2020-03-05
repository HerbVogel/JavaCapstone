// Applies the class `.background` to `<body>` when the page loads
$(document).ready(function() {
  $('body').addClass('background');
});

// Toggles the background modifier class
$('#background-toggle').click(function() {
  $('body').toggleClass('background--light background--dark');
});