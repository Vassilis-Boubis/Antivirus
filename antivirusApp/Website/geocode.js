
document
		.querySelector('.search-btn')
		.addEventListener(
				'click',
				function() {
					var inputValue = document
							.querySelector('.search-bar-input').value;
					var input = getUserInput();
					console.log(input);

					var apikey = 'f3f9c6b869de4117ae7fd321aaea815d';
					var latitude;
					var longitude;

					var api_url = 'https://api.opencagedata.com/geocode/v1/json'

					var request_url = api_url + '?' + '&q='
							+ encodeURIComponent(input) + '&key=' + apikey
							+ '&pretty=1' + '&no_annotations=1';

					var request = new XMLHttpRequest();
					request.open('GET', request_url, true);

					request.onload = function() {

						if (request.status == 200) {
							// Success!
							var data = JSON.parse(request.responseText);
							latitude = data.results[0].geometry.lat;
							longitude = data.results[0].geometry.lng;
							console.log(latitude, longitude);
							console.log(data.results);

							if (typeof (data.results[0].components.municipality) !== 'undefined') {
								alert("-On a 1km radius of "
										+ input
										+ " there have been recorded 12 new covid cases in the last 14 days.\n"
										+ "-"
										+ data.results[0].components.municipality
										+ " has had 45 new covid cases in the last 14 days.");

							} else if (typeof (data.results[0].components.suburb) !== 'undefined') {
								alert("-On a 1km radius of "
										+ input
										+ " there have been recorded 12 new covid cases in the last 14 days.\n"
										+ "-"
										+ data.results[0].components.suburb
										+ " has had 45 new covid cases in the last 14 days.");
							} else {
								alert("-On a 1km radius of "
										+ input
										+ " there have been recorded 12 new covid cases in the last 14 days.\n"
										+ "-"
										+ data.results[0].components.town
										+ " has had 45 new covid cases in the last 14 days.");
							}

							var map = L.map('map').setView(
									[ latitude, longitude ], 15);
							L
									.tileLayer(
											'https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=ZAsJI4cOmQysZB4SLofQ',
											{
												tileSize : 512,
												zoomOffset : -1,
												minZoom : 1,
												attribution : "\u003ca href=\"https://www.maptiler.com/copyright/\" target=\"_blank\"\u003e\u0026copy; MapTiler\u003c/a\u003e \u003ca href=\"https://www.openstreetmap.org/copyright\" target=\"_blank\"\u003e\u0026copy; OpenStreetMap contributors\u003c/a\u003e",
												crossOrigin : true

											}).addTo(map);
							var marker = L.marker([ latitude, longitude ])
									.addTo(map);

						} else if (request.status <= 500) {
							// We reached our target server, but it returned an
							// error

							console.log("unable to geocode! Response code: "
									+ request.status);
							var data = JSON.parse(request.responseText);
							console.log(data.status.message);
						} else {
							console.log("server error");
						}
					};

					request.onerror = function() {
						// There was a connection error of some sort
						console.log("unable to connect to server");
					};

					request.send(); // make the request
				});

document
		.querySelector(".search-bar")
		.addEventListener(
				'keyup',
				function(e) {
					if (e.which === 13) {

						var input = getUserInput();
						console.log(input);

						var apikey = 'f3f9c6b869de4117ae7fd321aaea815d';
						var latitude;
						var longitude;

						var api_url = 'https://api.opencagedata.com/geocode/v1/json'

						var request_url = api_url + '?' + '&q='
								+ encodeURIComponent(input) + '&key=' + apikey
								+ '&pretty=1' + '&no_annotations=1';

						var request = new XMLHttpRequest();
						request.open('GET', request_url, true);

						request.onload = function() {

							if (request.status == 200) {
								// Success!
								var data = JSON.parse(request.responseText);
								latitude = data.results[0].geometry.lat;
								longitude = data.results[0].geometry.lng;
								console.log(latitude, longitude);

								var map = L.map('map').setView(
										[ latitude, longitude ], 15);
								L
										.tileLayer(
												'https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=ZAsJI4cOmQysZB4SLofQ',
												{
													tileSize : 512,
													zoomOffset : -1,
													minZoom : 1,
													attribution : "\u003ca href=\"https://www.maptiler.com/copyright/\" target=\"_blank\"\u003e\u0026copy; MapTiler\u003c/a\u003e \u003ca href=\"https://www.openstreetmap.org/copyright\" target=\"_blank\"\u003e\u0026copy; OpenStreetMap contributors\u003c/a\u003e",
													crossOrigin : true

												}).addTo(map);
								var marker = L.marker([ latitude, longitude ])
										.addTo(map);

							} else if (request.status <= 500) {
								// We reached our target server, but it returned
								// an error

								console
										.log("unable to geocode! Response code: "
												+ request.status);
								var data = JSON.parse(request.responseText);
								console.log(data.status.message);
							} else {
								console.log("server error");
							}
						};

						request.onerror = function() {
							// There was a connection error of some sort
							console.log("unable to connect to server");
						};

						request.send(); // make the request
					}
				});

function getUserInput() {
	var inputValue = document.querySelector('.search-bar-input').value;

	return inputValue;
}
