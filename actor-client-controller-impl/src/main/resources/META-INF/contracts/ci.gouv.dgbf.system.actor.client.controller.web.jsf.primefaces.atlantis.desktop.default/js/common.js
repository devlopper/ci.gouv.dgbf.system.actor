function printElementInnerHtmlByIdentifier(elementIdentifier) {
	var elementInnerHtml = document.getElementById(elementIdentifier).innerHTML;
	var bodyInnerHtml = document.body.innerHTML;

	document.body.innerHTML = elementInnerHtml;
	window.print();
	document.body.innerHTML = bodyInnerHtml;
}