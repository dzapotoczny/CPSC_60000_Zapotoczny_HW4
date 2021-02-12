////////////////////////////////////////////////////////////////////////////////////////////////////
// Name:            Daniel Zapotoczny
// Date:            12-Feb-2021
// Course Name:		CPSC 60000 | Object Oriented Development
// Semester:		Spring I 2021
// Assignment Name:	PROGRAMMING ASSIGNMENT #4 - Iterator Pattern
// Program Name:	ZapotocznyHW4
////////////////////////////////////////////////////////////////////////////////////////////////////

public class ZapotocznyHW4 {
    public static void main(String args[]){
        AMDProcessors amdProcessors = new AMDProcessors();
        IntelProcessors intelProcessors = new IntelProcessors();

        CPUPicker cpuPicker = new CPUPicker(amdProcessors, intelProcessors);
        cpuPicker.printMenu();
    }


}
