package com.axelor.meta.views;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "object-views")
public class ObjectViews {
	
	@XmlElement(name = "menuitem", type = MenuItem.class)
	private List<MenuItem> menus;
	
	@XmlElement(name = "action-menu", type = MenuItem.class)
	private List<MenuItem> actionMenus;

	@XmlElement(name = "selection")
	private List<Selection> selections;

	@XmlElements({
		@XmlElement(name = "form", type = FormView.class),
		@XmlElement(name = "grid", type = GridView.class),
		@XmlElement(name = "tree", type = TreeView.class),
		@XmlElement(name = "chart", type = ChartView.class),
		@XmlElement(name = "portal", type = Portal.class),
		@XmlElement(name = "search", type = Search.class),
		@XmlElement(name = "calendar", type = CalendarView.class)
	})
	private List<AbstractView> views;
	
	@XmlElements({
		@XmlElement(name = "action-validate", type=ActionValidate.class),
		@XmlElement(name = "action-condition", type=ActionCondition.class),
		@XmlElement(name = "action-record", type=ActionRecord.class),
		@XmlElement(name = "action-method", type=ActionMethod.class),
		@XmlElement(name = "action-attrs", type=ActionAttrs.class),
		@XmlElement(name = "action-view", type=ActionView.class),
		@XmlElement(name = "action-ws", type=ActionWS.class),
		@XmlElement(name = "action-import", type=ActionImport.class),
		@XmlElement(name = "action-export", type=ActionExport.class),
		@XmlElement(name = "action-group", type=ActionGroup.class),
		@XmlElement(name = "action-workflow", type=ActionWorkflow.class)
	})
	private List<Action> actions;
	
	public List<MenuItem> getMenus() {
		return menus;
	}
	
	public void setMenus(List<MenuItem> menus) {
		this.menus = menus;
	}
	
	public List<MenuItem> getActionMenus() {
		return actionMenus;
	}
	
	public void setActionMenus(List<MenuItem> actionMenus) {
		this.actionMenus = actionMenus;
	}

	public List<Selection> getSelections() {
		return selections;
	}
	
	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}
	
	public List<AbstractView> getViews() {
		return views;
	}

	public void setViews(List<AbstractView> views) {
		this.views = views;
	}
	
	public List<Action> getActions() {
		return actions;
	}
	
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
