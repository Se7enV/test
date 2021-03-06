package edu.fzu.hrmis.ui;

/**
 * 
 * UI部件工厂
 * 
 * @author Se7en
 *
 */
public class UIFactory {

	private static final UIFactory FACTORY = new UIFactory();

	public static UIFactory getInstance() {
		return FACTORY;
	}
	
	private UIFactory() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 根据UIType获得UI部件
	 * @param type
	 * @return
	 */
	public BaseUI getUI(UIType type) {
		
		BaseUI componentUI = null;
		
		if(type.equals(UIType.MainMenuUI))
			return new MainMenuUI();
		else if(type.equals(UIType.EmpListUI))
			return new EmpListUI();
		else if(type.equals(UIType.EmpSortedListUI))
			return new EmpSortedListUI();
		else if(type.equals(UIType.EmpSimpleListUI))
			return new EmpSimpleListUI();
		else if(type.equals(UIType.EmpSimpleSortedListUI))
			return new EmpSimpleSortedListUI();
		else if(type.equals(UIType.EmpAddUI))
			return new EmpAddUI();
		else if(type.equals(UIType.EmpSearchUI))
			return new EmpSearchUI();
		else if(type.equals(UIType.EmpDeleteUI))
			return new EmpDeleteUI();
		else if(type.equals(UIType.EmpUpdateUI))
			return new EmpUpdateUI();
		else if(type.equals(UIType.EmpLoginUI)) 
			return new EmpLoginUI();

		return componentUI;
		
	}

}
