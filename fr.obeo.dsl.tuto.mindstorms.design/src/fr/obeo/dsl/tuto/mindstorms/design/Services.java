package fr.obeo.dsl.tuto.mindstorms.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.tuto.mindstorms.Instruction;

import fr.obeo.dsl.tuto.mindstorms.Choreography;

/**
 * The services class used by VSM.
 */
public class Services {
	
	public Instruction getNextInstruction(Instruction instruction) {
		Choreography parentChoreography=(Choreography)instruction.eContainer();
		List<Instruction> actions=parentChoreography.getInstructions();
		int position=actions.indexOf(instruction);
		if (position==actions.size()-1) {
			return null;
		}
		else {
			return actions.get(position+1);
		}
	}
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
}
