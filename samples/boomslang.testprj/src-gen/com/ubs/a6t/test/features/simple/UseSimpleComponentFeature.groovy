package com.ubs.a6t.test.features.simple

/** 
 * Generated by: Default feature generator 
 */ 
class UseSimpleComponentFeature extends org.boomslang.features.BoomslangFeature {

	def "ReUse components from asset folder"() {
	
		given:
			to (UseSimpleComponentScreen);
		
		when:
		name.value $name
		and:
		submit.click()
		and:
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileAction"
		and:
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileAction"
		and:
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileAction"
		
		where:
		$name | // TODO
		println "command actions of type BSelectAction not yet implemented in compileActionPlaceholder" | 
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileActionPlaceholder" | 
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileActionPlaceholder"
		"sda" | // TODO
		println "command actions of type BSelectAction not yet implemented in compileActionParameter" | 
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileActionParameter" | 
		// TODO
		println "command actions of type BSelectAction not yet implemented in compileActionParameter"
	}
	

}
