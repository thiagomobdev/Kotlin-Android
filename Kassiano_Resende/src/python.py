import pyautogui
import time

# Número de vezes para alternar
repeticoes = 300
# Intervalo entre alternâncias em segundos
intervalo = 5 * 60  # 5 minutos

print("Iniciando o script. Pressione Ctrl+C para interromper.")

try:
    for i in range(repeticoes):
        pyautogui.keyDown("alt")  # Segura a tecla ALT
        pyautogui.press("tab")    # Pressiona TAB
        pyautogui.keyUp("alt")    # Solta a tecla ALT
        print(f"Alternância {i+1}/{repeticoes} concluída.")
        time.sleep(intervalo)  # Aguarda o intervalo de 5 minutos
except KeyboardInterrupt:
    print("\nScript interrompido pelo usuário.")
