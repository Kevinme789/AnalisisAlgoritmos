import matplotlib.pyplot as plt

# Datos de la tabla
n = [1, 5, 10, 15, 20]
t1 = [4, 256, 2011, 6766, 16021]
t2 = [49, 1057, 4207, 9457, 16707]

# Crear el gráfico
plt.figure(figsize=(8, 5))
plt.plot(n, t1, marker='o', label='t1')
plt.plot(n, t2, marker='s', label='t2', linestyle='--')
plt.title('Comparación de t1 y t2')
plt.xlabel('n')
plt.ylabel('Tiempo')
plt.legend()
plt.grid(True)
plt.tight_layout()

# Guardar como PNG
output_path = 'graficoSemana4.png'
plt.savefig(output_path)
output_path
