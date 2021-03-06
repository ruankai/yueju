<div class="footer footerdark">

		<div class="text-center wraptotop">

			<a class="totop"><i class="icon-chevron-up"></i></a>


		</div>

	</div>

	

	<!-- FOOTER END

================================================== -->

</div>

<!-- /.body -->

<!-- Le javascript

    ================================================== -->

<!-- Placed at the end of the document so the pages load faster -->

<script src="js/jquery.js"></script>

<script src="js/bootstrap.js"></script>

<script src="js/plugins.js"></script>

<script src="js/custom.js"></script>

<!-- CALL CAMERA SLIDER -->

<script>

	jQuery(function(){

		jQuery('#camera_wrap_4').camera({

			height: 'auto',

			loader: 'bar',

			pagination: false,

			thumbnails: false,

			hover: true,

			opacityOnGrid: false,

			fx: 'random',

			transPeriod: 1500,

			time: 7000,

			overlayer: true,

			imagePath: 'img/'

		});

	});

</script>

<!-- CALL FEATURED WORK -->

<script type="text/javascript">

$(window).load(function(){			

			$('#recent-projects').carouFredSel({

				responsive: true,

				width: '100%',

				auto: true,

				circular	: true,

				infinite	: false,

				prev : {

					button		: "#car_prev",

					key			: "left",

						},

				next : {

					button		: "#car_next",

					key			: "right",

							},

				swipe: {

					onMouse: true,

					onTouch: true

					},

				scroll : 1500,

				items: {

					visible: {

						min: 1,

						max: 1

					}

				}

			});

		});	

</script>

<!-- CALL ACCORDION -->

<script type="text/javascript">

	$(".accordion h3").eq(0).addClass("active");

	$(".accordion .accord_cont").eq(0).show();

	$(".accordion h3").click(function(){

		$(this).next(".accord_cont").slideToggle("slow")

		.siblings(".accord_cont:visible").slideUp("slow");

		$(this).toggleClass("active");

		$(this).siblings("h3").removeClass("active");

	});	

</script>

<!-- Call opacity on hover images from recent news-->

<script type="text/javascript">

$(document).ready(function(){

    $("img.imgOpa").hover(function() {

      $(this).stop().animate({opacity: "0.6"}, 'slow');

    },

    function() {

      $(this).stop().animate({opacity: "1.0"}, 'slow');

    });

  });

</script>


<!--BEGIN DEMO PANEL

================================================== -->

<!-- Style Switcher Files-->

<link rel="stylesheet" href="demo/css/style-switcher.css" media="screen"/>

<link rel="stylesheet" href="demo/css/colorpicker.css" media="screen"/>

<script type="text/javascript" src="demo/js/jquery.cookie.js"></script>

<script type="text/javascript" src="demo/js/styleswitch.js"></script>

<script type="text/javascript" src="demo/js/colorpicker.js"></script>

<script type="text/javascript" src="demo/js/switcher.js"></script>

<!-- DEMO PANEL -->

<div id="switcher-handle">

	<a class="" id="handle" href="#">feedback</a>

	<div id="style-switcher">

		<div id="switcher-header">

			<p>

				Theme Options

			</p>

		</div>

		<div id="switcher-body">

			<p>

				<strong>Layout Style</strong>

			</p>

		<select id="layout">		   

		  <option value="boxed">Boxed</option>

		  <option value="wide">Wide</option>		  

		</select>

		

			<p>

				<strong>Color Schemes</strong>

			</p>

			

			<div class="colors-holder">

				<a href="#" class="color-box" data-rel="e7402f"></a>

				<a href="#" class="color-box" data-rel="0E8FAB"></a>				

				<a href="#" class="color-box" data-rel="44cfc8"></a>				

				<a href="#" class="color-box" data-rel="9DC500"></a>				

				<a href="#" class="color-box" data-rel="76719a"></a>				

				<a href="#" class="color-box" data-rel="f2a020"></a>

				<a href="#" class="color-box" data-rel="33bee5"></a>				

				<a href="#" class="color-box" data-rel="e44884"></a>

				<a href="#" class="color-box" data-rel="18adb5"></a>				

				<a href="#" class="color-box" data-rel="f0b70c"></a>

				

				<a href="#" class="color-box" data-rel="346b7f"></a>

				<a href="#" class="color-box" data-rel="aecdcf"></a>

				<a href="#" class="color-box" data-rel="be9869"></a>

				<a href="#" class="color-box" data-rel="bf6c2f"></a>				

				<a href="#" class="color-box" data-rel="1abc9c"></a>				

				<a href="#" class="color-box" data-rel="7f8c8d"></a>				

				<a href="#" class="color-box" data-rel="b4ad7f"></a>				

				<a href="#" class="color-box" data-rel="fe6c6c"></a>				

				<a href="#" class="color-box" data-rel="e66a47"></a>

				<a href="#" class="color-box" data-rel="50e9f3"></a>

			</div>

			<div class="switcher-divider">

			</div>

			

			<p>

				<strong>Bg Patterns (for boxed)</strong>

			</p>

			<div class="colors-holder">

				<a data-rel="1" class="bg-box" href="#"></a>

				<a data-rel="2" class="bg-box" href="#"></a>

				<a data-rel="3" class="bg-box" href="#"></a>

				<a data-rel="4" class="bg-box" href="#"></a>

				<a data-rel="5" class="bg-box" href="#"></a>

				<a data-rel="6" class="bg-box" href="#"></a>

				<a data-rel="7" class="bg-box" href="#"></a>

				<a data-rel="8" class="bg-box" href="#"></a>

				<a data-rel="9" class="bg-box" href="#"></a>

				<a data-rel="10" class="bg-box" href="#"></a>

				<a data-rel="11" class="bg-box" href="#"></a>

				<a data-rel="12" class="bg-box" href="#"></a>

				<a data-rel="13" class="bg-box" href="#"></a>

				<a data-rel="14" class="bg-box" href="#"></a>

				<a data-rel="15" class="bg-box" href="#"></a>

				<a data-rel="16" class="bg-box" href="#"></a>

				<a data-rel="17" class="bg-box" href="#"></a>

				<a data-rel="18" class="bg-box" href="#"></a>

				<a data-rel="19" class="bg-box" href="#"></a>

				<a data-rel="20" class="bg-box" href="#"></a>

				<a data-rel="21" class="bg-box" href="#"></a>

				<a data-rel="22" class="bg-box" href="#"></a>

				<a data-rel="23" class="bg-box" href="#"></a>

				<a data-rel="24" class="bg-box" href="#"></a>

			</div>

		

		

		<div class="switcher-divider">

			</div>

			

			<p>

				<strong>Bg Images (for boxed)</strong>

			</p>

			<div class="colors-holder">

			<a data-rel="pic1" class="bgimg-box" href="#"></a>

			<a data-rel="pic2" class="bgimg-box" href="#"></a>

			<a data-rel="pic3" class="bgimg-box" href="#"></a>

			<a data-rel="pic4" class="bgimg-box" href="#"></a>

			<a data-rel="pic5" class="bgimg-box" href="#"></a>

			<a data-rel="pic6" class="bgimg-box" href="#"></a>

			<a data-rel="pic7" class="bgimg-box" href="#"></a>

			<a data-rel="pic8" class="bgimg-box" href="#"></a>

			<br/><br/>

			</div>

			

		</div>	

			

		<div id="switcher-footer">

			<p>

				<a href="http://www.wowthemes.net/premium-themes-templates/" target="_blank"><img src="demo/images/logowowthemes.png"></a>

			</p>

		</div>

	</div>

</div>

<!-- END DEMO PANEL-->

</body>

</html>