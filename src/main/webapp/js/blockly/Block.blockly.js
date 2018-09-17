window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Block = window.blockly.js.blockly.Block || {};

/**
 * Block
 */
window.blockly.js.blockly.Block.Execute = function() {
	var item, teste;
	item = null;
	window.alert(this.cronapi.conversion.toString(this.cronapi.dateTime
			.formatDateTime(this.cronapi.dateTime.getNow(), 'HH:mm:ss')));
	this.cronapi.screen.changeValueOfField("vars.input5293",
			this.cronapi.conversion.toString(this.cronapi.conversion
					.stringToDate(item)));
}
