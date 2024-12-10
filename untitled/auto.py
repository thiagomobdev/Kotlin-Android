import pyautogui
import time

# Intervalo entre pressionamentos em segundos
intervalo = 3.0  # Tempo entre ações
pressF = 0.2
potionPress = 900.0
# Tempo total de execução em segundos
tempo_total = 18000  # 5 horas, por exemplo

print("Iniciando o script. Pressione Ctrl+C para parar.")

try:
    start_time = time.time()
    while time.time() - start_time < tempo_total:
        pyautogui.press("space")  # Pressiona a tecla SPACE
        print("Tecla SPACE pressionada.")
        time.sleep(intervalo)  # Aguarda o intervalo antes de pressionar outra tecla

        pyautogui.press("f")  # Pressiona a tecla F
        print("Tecla F pressionada.")
        time.sleep(pressF)  # Aguarda antes de repetir o ciclo
        pyautogui.press("2")
        # time.sleep(potionPress)
except KeyboardInterrupt: 
    print("\nScript interrompido pelo usuário.")
