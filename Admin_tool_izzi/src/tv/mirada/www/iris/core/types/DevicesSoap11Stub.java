/**
 * DevicesSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tv.mirada.www.iris.core.types;

public class DevicesSoap11Stub extends org.apache.axis.client.Stub implements tv.mirada.www.iris.core.types.Devices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "DeleteCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeleteCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "CreateCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "CreateCustomerPremisesEquipmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivateCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "DeactivateCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeactivateCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.DeactivateCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindCustomerPremisesEquipmentType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "FindCustomerPremisesEquipmentTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentTypeRequest"), tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentTypeResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "FindCustomerPremisesEquipmentTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCustomerPremisesEquipmentType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "UpdateCustomerPremisesEquipmentTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">UpdateCustomerPremisesEquipmentTypeRequest"), tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "FindCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "FindCustomerPremisesEquipmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RefreshCustomerPremisesEquipmentEntitlements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "RefreshCustomerPremisesEquipmentEntitlementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">RefreshCustomerPremisesEquipmentEntitlementsRequest"), tv.mirada.www.iris.core.CPE.messages.RefreshCustomerPremisesEquipmentEntitlementsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "ActivateCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">ActivateCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.ActivateCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerPremisesEquipmentType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "CreateCustomerPremisesEquipmentTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentTypeRequest"), tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentTypeResponse"));
        oper.setReturnClass(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "CreateCustomerPremisesEquipmentTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCustomerPremisesEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "UpdateCustomerPremisesEquipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">UpdateCustomerPremisesEquipmentRequest"), tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCustomerPremisesEquipmentType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", "DeleteCustomerPremisesEquipmentTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeleteCustomerPremisesEquipmentTypeRequest"), tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public DevicesSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DevicesSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DevicesSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">ActivateCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.ActivateCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentTypeRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">CreateCustomerPremisesEquipmentTypeResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeactivateCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.DeactivateCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeleteCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">DeleteCustomerPremisesEquipmentTypeRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentTypeRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">FindCustomerPremisesEquipmentTypeResponse");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">RefreshCustomerPremisesEquipmentEntitlementsRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.RefreshCustomerPremisesEquipmentEntitlementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">UpdateCustomerPremisesEquipmentRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/CPE/messages", ">UpdateCustomerPremisesEquipmentTypeRequest");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipment");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.CustomerPremisesEquipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "CustomerPremisesEquipmentType");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.CustomerPremisesEquipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeviceClassName");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.DeviceClassName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "DeviceTypeName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "HardwareId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "IrisId");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorBSSSubscriberId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorBSSSystem");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "OperatorSubscriberId");
            cachedSerQNames.add(qName);
            cls = tv.mirada.www.iris.core.types.OperatorSubscriberId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "RegionCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.mirada.tv/iris/core/types", "RegionName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void deleteCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentRequest deleteCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deleteCustomerPremisesEquipmentRequest});

    }

    public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse createCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentRequest createCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createCustomerPremisesEquipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deactivateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.DeactivateCustomerPremisesEquipmentRequest deactivateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeactivateCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deactivateCustomerPremisesEquipmentRequest});

    }

    public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse findCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeRequest findCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindCustomerPremisesEquipmentType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findCustomerPremisesEquipmentTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentTypeRequest updateCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCustomerPremisesEquipmentType"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {updateCustomerPremisesEquipmentTypeRequest});

    }

    public tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse findCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentRequest findCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {findCustomerPremisesEquipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.CPE.messages.FindCustomerPremisesEquipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void refreshCustomerPremisesEquipmentEntitlements(tv.mirada.www.iris.core.CPE.messages.RefreshCustomerPremisesEquipmentEntitlementsRequest refreshCustomerPremisesEquipmentEntitlementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RefreshCustomerPremisesEquipmentEntitlements"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {refreshCustomerPremisesEquipmentEntitlementsRequest});

    }

    public void activateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.ActivateCustomerPremisesEquipmentRequest activateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {activateCustomerPremisesEquipmentRequest});

    }

    public tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse createCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeRequest createCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerPremisesEquipmentType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createCustomerPremisesEquipmentTypeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, tv.mirada.www.iris.core.CPE.messages.CreateCustomerPremisesEquipmentTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateCustomerPremisesEquipment(tv.mirada.www.iris.core.CPE.messages.UpdateCustomerPremisesEquipmentRequest updateCustomerPremisesEquipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCustomerPremisesEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {updateCustomerPremisesEquipmentRequest});

    }

    public void deleteCustomerPremisesEquipmentType(tv.mirada.www.iris.core.CPE.messages.DeleteCustomerPremisesEquipmentTypeRequest deleteCustomerPremisesEquipmentTypeRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCustomerPremisesEquipmentType"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {deleteCustomerPremisesEquipmentTypeRequest});

    }

}
