# LoginCmsFault

### **`xs:include`**

```xml
xs:include
```

- **Uso:** Se utiliza para **incluir esquemas que comparten el mismo `targetNamespace`**.
- **Funcionamiento:** Combina el contenido de un archivo XSD externo con el esquema actual, tratándolos como parte del mismo espacio de nombres.
- **Restricciones:** No permite incluir esquemas que tengan un `targetNamespace` diferente del esquema principal.

### **`xs:import`**

```xml
xs:import
```

- **Uso:** Se utiliza para **importar esquemas que tienen un `targetNamespace` diferente** al del esquema principal.
- **Funcionamiento:** Permite reutilizar tipos definidos en otro namespace, pero mantiene la separación de los espacios de nombres.
- **Restricciones:** Es necesario especificar el `namespace` del esquema que se está importando y el archivo externo debe declarar un `targetNamespace` distinto.
