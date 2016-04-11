<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
    <base href="<%=request.getContextPath()%>/">
    <title>案件导入</title>
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/vendor/bootstrap-v3.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/style/standard/css/eccrm-common-new.css">
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/vendor/angular-motion-v0.3.2/angular-motion.min.css">
    <link rel="stylesheet" type="text/css" href="<%=contextPath%>/vendor/zTree/css/ztree.css">
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/jquery-all.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-all.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-strap-all.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-ztree-all.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/static/ycrl/javascript/angular-upload.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/app/org/org.js"></script>

    <script>
        window.angular.contextPathURL = '<%=contextPath%>';
    </script>
</head>
<body>
<div class="main" ng-app="spec.member.import" ng-controller="Ctrl">
    <div class="block">
        <div class="block-header">
                <span class="header-text">
                    <span class="glyphicons info-sign"></span>
                    <span></span>
                </span>
        </div>
        <div class="block-content">
            <div class="content-wrap">
                <form name="form" class="form-horizontal" role="form">
                    <div ng-cloak>
                        <div class="row" ng-if="emp.positionCode=='SUPER_MANAGER'">
                            <div class="form-label col-1-half">
                                <label>县（市）区:</label>
                            </div>
                            <div class="col-2-half" style="position: relative">
                                <input class="col-12" type="text" ng-model="extra.orgName"
                                       validate validate-required readonly ztree-single="orgTree"/>
                            </div>
                        </div>
                        <div class="row" ng-if="emp.positionCode=='SUPER_MANAGER'||emp.positionCode=='EJGLY'">
                            <div class="form-label col-1-half">
                                <label validate-error="form.tzz">团组织:</label>
                            </div>
                            <select class="col-2-half" name="tzz" ng-model="extra.tzz"
                                    ng-options="foo.value as foo.name for foo in tzz"
                                    validate validate-required></select>
                            <div class="form-label col-1-half">
                                <label>团组织名称:</label>
                            </div>
                            <input class="col-2-half" type="text" ng-model="extra.tzzName"
                                   validate validate-required maxlength="20"/>
                        </div>
                        <div class="row" ng-if="emp.positionCode=='SUPER_MANAGER'||emp.positionCode=='EJGLY'">
                            <div class="form-label col-1-half">
                                <label validate-error="form.ly">领域:</label>
                            </div>
                            <select class="col-2-half" name="ly" ng-model="extra.ly" name="ly"
                                    ng-options="foo.value as foo.name for foo in ly"
                                    ng-change="lyChange();"
                                    validate validate-required></select>
                            <div class="form-label col-1-half">
                                <label>子领域:</label>
                            </div>
                            <select class="col-2-half" ng-model="extra.ly2"
                                    ng-options="foo.value as foo.name for foo in ly2"></select>
                        </div>
                    </div>
                    <div class="row" eccrm-upload="fileUpload"></div>
                    <div class="row" style="margin-left: 10.5%;margin-top:8px;">
                        <p style="font-size: 14px;font-weight: 700;">注意：</p>

                        <p>1. 附件不支持多页签(只会读取sheet1的数据)!</p>

                        <p>2. 如果数据不正确，将会全部失败!</p>

                    </div>
                    <div class="button-row">
                        <a class="btn" ng-href="<%=contextPath%>/base/employee/template" target="_blank"
                           style="width: 120px;height: 50px;line-height: 50px;">下载模板</a>
                        <button class="btn" ng-click="importData();" ng-disabled="!canImport || form.$invalid"
                                style="margin-left:80px;width: 150px;">执行导入
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="<%=contextPath%>/app/employee/employee.js"></script>
<script type="text/javascript" src="<%=contextPath%>/app/spec/member/member_import.js"></script>
</html>
