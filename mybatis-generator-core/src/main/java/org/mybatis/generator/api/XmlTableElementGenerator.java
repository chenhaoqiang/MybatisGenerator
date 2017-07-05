package org.mybatis.generator.api;

public class XmlTableElementGenerator {
	public static void main(String[] args) {
		String[] tableNames = new String[] { "SC_DICT","SC_DICTTYPE", "SC_CAMPUS", "SC_DUTY", "SC_DUTYAUTHORITY", "SC_ETAPP", "SC_ENTERPRICE", "SC_MODULE",
		        "SC_OPERATOR", "SC_OPERATOR_DEPNUM", "SC_ROLES", "SC_ROLES_DUTY", "SC_WORKSPACE", "SC_WORKSPACE_MODULE" };
		String s = getTable(tableNames);
		System.out.println(s);
	}

	private static String getTable(String[] tableNames) {
		/*
		 * <table tableName="SC_DUTY" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false"
		 * enableSelectByExample="false" selectByExampleQueryId="false" />
		 */
		StringBuilder sb = new StringBuilder();
		for (String name : tableNames) {
			sb.append("<table tableName=\"").append(name).append("\"");
			sb.append("\r\n");
			sb.append("enableCountByExample=\"false\" enableUpdateByExample=\"false\"");
			sb.append("\r\n");
			sb.append("enableDeleteByExample=\"false\" enableSelectByExample=\"false\"");
			sb.append("\r\n");
			sb.append("selectByExampleQueryId=\"false\" />");
			sb.append("\r\n");
		}
		return sb.toString();
	}
}
