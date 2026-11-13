/* dashboard.js — place in src/main/webapp/resources/js/ */
(function () {
	'use strict';

	var reduceMotion = window.matchMedia
			&& window.matchMedia('(prefers-reduced-motion: reduce)').matches;

	/* ---- KPI count-up (runs once on load) ---- */
	function countUp() {
		document.querySelectorAll('.kpi-value[data-count]').forEach(function (el) {
			var target = parseInt(el.getAttribute('data-count'), 10);
			if (isNaN(target) || reduceMotion || target === 0) { return; }
			var start = null, duration = 900;
			function step(ts) {
				if (start === null) { start = ts; }
				var t = Math.min((ts - start) / duration, 1);
				var eased = 1 - Math.pow(1 - t, 3);
				el.textContent = Math.round(target * eased);
				if (t < 1) { requestAnimationFrame(step); }
			}
			el.textContent = '0';
			requestAnimationFrame(step);
		});
	}

	/* ---- Colour the status text, whatever values the bean returns ---- */
	function classifyStatus() {
		document.querySelectorAll('.status-pill').forEach(function (el) {
			var s = (el.textContent || '').toLowerCase();
			el.classList.remove('is-done', 'is-ongoing', 'is-planned', 'is-late');
			if (/complet|conclu|done|finish|execut/.test(s)) { el.classList.add('is-done'); }
			else if (/ongo|andamento|progress|curso/.test(s)) { el.classList.add('is-ongoing'); }
			else if (/plan|pendin|pendente/.test(s)) { el.classList.add('is-planned'); }
			else if (/late|delay|atras|cancel/.test(s)) { el.classList.add('is-late'); }
		});
	}

	/* ---- Filter the table by status (chips and chart click) ---- */
	function applyFilter(text) {
		var input = document.querySelector('input.dash-search');
		if (!input || !window.PF) { return; }
		input.value = text;
		PF('activitiesTable').filter();
		document.querySelectorAll('.status-chips .chip').forEach(function (c) {
			c.classList.toggle('is-active', c.getAttribute('data-filter') === text);
		});
	}

	// Called by the status chart: window.dashFilterStatus('Ongoing')
	window.dashFilterStatus = applyFilter;

	document.addEventListener('click', function (e) {
		var chip = e.target.closest ? e.target.closest('.status-chips .chip') : null;
		if (chip) { applyFilter(chip.getAttribute('data-filter') || ''); }
	});

	document.addEventListener('DOMContentLoaded', function () {
		countUp();
		classifyStatus();

		// The table is re-rendered by PrimeFaces on filter and page change.
		var table = document.querySelector('.dash-table');
		if (table && window.MutationObserver) {
			new MutationObserver(classifyStatus)
					.observe(table, { childList: true, subtree: true });
		}
	});
})();
